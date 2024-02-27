import React, { useState } from 'react';
import Menu from "./menuApi";


function Card() {
    const [menuData, setMenuData] = useState(Menu);
    console.log(menuData);
    return (
        <><Card menuData={menuData}/></>
    )
}

export default Card