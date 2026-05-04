import React from "react";
import "./Header.css";

function Header() {
  return (
    <header className="header">
      <div className="logo">Expense Tracker Application</div>

      <nav>
        <ul className="nav-links">
          <li><a href="/">Home</a></li>
          <li><a href="/">Contact</a></li>
        </ul>
      </nav>
    </header>
  );
}

export default Header;