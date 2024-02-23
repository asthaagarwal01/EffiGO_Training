import React from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faGithub } from '@fortawesome/free-brands-svg-icons';
import { faGooglePlus } from '@fortawesome/free-brands-svg-icons';
import { faFacebook } from '@fortawesome/free-brands-svg-icons';
import { faLinkedin } from '@fortawesome/free-brands-svg-icons';
import Button from './Button';

function Left() {
    return (
        <div>
            <h2>Sign In</h2>
            <div className='icons'>
                <div className='box'>
                    <div className='box'>
                        <FontAwesomeIcon icon={faGithub} /></div>
                    <div className='box'>
                    <FontAwesomeIcon icon={faGooglePlus} /></div>
                    <div className='box'>
                    <FontAwesomeIcon icon={faFacebook} /></div>
                    <div className='box'>
                    <FontAwesomeIcon icon={ faLinkedin } /></div>
                </div>
                <p id='text'>or log in using email and password</p>
            </div>
            <input type='email' placeholder='Email address' name='email' required></input>
            <input type='password' placeholder='Password' name='email' required></input>
            <a>Forgot your email or password ?</a>
            <Button color="primary"></Button>
        </div>
    )
}

export default Left