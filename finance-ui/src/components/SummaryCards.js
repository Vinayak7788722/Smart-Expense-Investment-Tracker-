import { useEffect, useState } from "react";
import axios from "axios";

export default function SummaryCards() {

  const [data, setData] = useState({});

  useEffect(() => {
    axios.get("http://localhost:8080/investments/summary")
      .then(res => {
        setData(res.data.data);
      })
      .catch(err => console.error(err));
  }, []);

  return (
   <div className="cards">
  <div className="card">
    <p>Total Invested</p>
    <h2>₹ {data.totalInvested}</h2>
  </div>

  <div className="card">
    <p>Current Value</p>
    <h2>₹ {data.totalCurrent}</h2>
  </div>

  <div className="card">
    <p>Profit</p>
    <h2 style={{ color: "green" }}>₹ {data.totalProfit}</h2>
  </div>
</div>
    
  );
}

const cardStyle = {
  background: "#fff",
  padding: "20px",
  width: "200px",
  textAlign: "center",
  borderRadius: "10px",
  boxShadow: "0 0 10px rgba(0,0,0,0.1)"
  
};