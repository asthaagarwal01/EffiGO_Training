import React, { useState } from 'react';
import MenuCard from './MenuCard';
import "./Card.css"
import Menu from "./menuApi.js";

function Card() {
    const [menuData, setMenuData] = useState(Menu);

    const filter=(category)=>{
        const updatedList=Menu.filter((curEle)=>{return curEle.category===category})
        setMenuData(updatedList);
    }
    return (
        <>
            <div className='nav'>
                <nav>
                    <ul>
                        <li><button onClick={() => filter("Breakfast")}>Breakfast</button></li>
                        <li><button onClick={() => filter("Lunch")}>Lunch</button></li>
                        <li><button onClick={() => filter("Evening Snacks")}>Evening Snacks</button></li>
                        <li><button onClick={() => filter("Dinner")}>Dinner</button></li>
                        <li><button onClick={() => setMenuData(Menu)}>All</button></li>
                    </ul>
                </nav>
            </div>
            <h2>Our Menu</h2>
            <div className='cards'>
                <MenuCard menuData={menuData} />
            </div>
        </>

    )
}

export default Card