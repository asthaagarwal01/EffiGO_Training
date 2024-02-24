import React from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faGithub } from '@fortawesome/free-brands-svg-icons';
import { faGooglePlus } from '@fortawesome/free-brands-svg-icons';
import { faFacebook } from '@fortawesome/free-brands-svg-icons';
import { faLinkedin } from '@fortawesome/free-brands-svg-icons';
import Button from './Button';
import "./Left.css"

function Left() {
    return (
        <div className='left'>
            <h2>Sign In</h2>
            <div >
                <div className='icons'>
                    <div className='box'>
                        <FontAwesomeIcon icon={faGithub} />
                    </div>
                    <div className='box'>
                        <FontAwesomeIcon icon={faGooglePlus} />
                    </div>
                    <div className='box'>
                        <FontAwesomeIcon icon={faFacebook} />
                    </div>
                    <div className='box'>
                        <FontAwesomeIcon icon={ faLinkedin } />
                    </div>
                </div>
                <p id='text'>or log in using email and password</p>
            </div>
            <input type='email' placeholder='Email address' name='email' required></input><br/>
            <input type='password' placeholder='Password' name='email' required></input><br/>
            <a href='#'>Forgot your email or password ?</a>
            <Button color="primary"></Button>
        </div>
    )
}

export default Left