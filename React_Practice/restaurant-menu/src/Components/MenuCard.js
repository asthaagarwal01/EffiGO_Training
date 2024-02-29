import React from 'react'
import "./MenuCard.css"


function MenuCard({ menuData }) {
  console.log(menuData);


  return (

    <>
      {menuData.map((curEle) => {
        return (
          <div className='display'>
            <div className='card' key={curEle.id}>
              <div className='images'>
                <img src={curEle.image} alt="food" title='' />
              </div>
              <div className='heading'>
                <h4>{curEle.name}</h4>
                <p id="description">{curEle.description}</p>
                <div className='order'>
                  <p id="price">{curEle.price}</p>
                  <button id="place-order">ORDER</button>
                </div>
              </div>
            </div>
          </div>
        )

      })}

    </>

  )
}

export default MenuCard