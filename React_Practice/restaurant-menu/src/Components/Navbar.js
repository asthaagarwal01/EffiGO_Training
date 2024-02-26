import React from 'react'
import "./Navbar.css"
function Navbar() {
  return (
    <div className='nav'>
        <nav>
            <ul>
                <li><a href="#">Breakfast</a></li>
                <li><a href="#">Lunch</a></li>
                <li><a href="#">Evening Snacks</a></li>
                <li><a href="#">Dinner</a></li>
                <li><a href="#">All</a></li>
            </ul>
        </nav>
    </div>
  )
}

export default Navbar