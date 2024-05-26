import React from "react";
import { Link } from "react-router-dom";
import "./Header.css";

export default function Header() {
  return (
    <div className="Header">
      <Link to="/" className="header-title">
        Online compiler
      </Link>
      <div className="header-how-it-works">How it works?</div>
    </div>
  );
}
