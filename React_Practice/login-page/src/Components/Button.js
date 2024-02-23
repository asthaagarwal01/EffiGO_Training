import React from 'react'
import "./Button.css";

function Button({color}) {
  return (
    <button className={`custom-button ${color}`}>SIGN IN</button>
  )
}

export default Button