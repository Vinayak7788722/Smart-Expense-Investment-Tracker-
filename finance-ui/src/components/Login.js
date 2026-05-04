import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const Login = () => {
  const navigate = useNavigate();

  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const res = await axios.post("http://localhost:8080/auth/login", {
        username,
        password
      });

      if (res.data?.token) {
        localStorage.setItem("token", res.data.token);
      }

      setMessage("Login Successful");
      navigate("/dashboard");

    } catch (error) {
      setMessage("Invalid username or password");
    }
  };

  return (
    <div className="login-container">
      <h2>Welcome!</h2>

      <form onSubmit={handleLogin}>

        <input
          type="text"
          placeholder="Enter Username"
          onChange={(e) => setUsername(e.target.value)}
        />

        <input
          type="password"
          placeholder="Enter Password"
          onChange={(e) => setPassword(e.target.value)}
        />

        <button type="submit">
          Login
        </button>

      </form>

      <p>{message}</p>
    </div>
  );
};

export default Login;