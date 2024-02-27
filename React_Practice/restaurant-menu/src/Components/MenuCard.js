import React from 'react'

function MenuCard({menuData}) {
  return (
    <>
    <div className='card-contain'>
        <div className='images'>
            <img src={image} alt="food" title='' />
        </div>
        <div className='heading'>
            <h4></h4>
            <p id="description"></p>
            <div className='order'>
                <p id="price"></p>
                <button id="place-order">ORDER</button>
             </div>
        </div>
    </div>
    </>
  )
}

export default MenuCard