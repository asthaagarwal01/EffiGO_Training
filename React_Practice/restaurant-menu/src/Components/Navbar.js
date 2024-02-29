import React from 'react'
import "./Navbar.css"
function Navbar() {

  const filter=(category)=>{
    
  }
  return (
    <div className='nav'>
        <nav>
            <ul>
                <li><button onClick={()=>filter("Breakfast")}>Breakfast</button></li>
                <li><button onClick={()=>filter("Lunch")}>Lunch</button></li>
                <li><button onClick={()=>filter("Evening Snacks")}>Evening Snacks</button></li>
                <li><button onClick={()=>filter("Dinner")}>Dinner</button></li>
                <li><button onClick={()=>filter("All")}>All</button></li>
            </ul>
        </nav>
    </div>
  )
}

export default Navbar