import React from 'react';
import MenuButton from '../components/buttons/MenuButton';
import { Link } from 'react-router-dom';

function Menu() {
    return (
        <>
            <div className="flex flex-col">
                <h1 className="p-5">Card Games</h1>
            </div>
            <div className="flex flex-col">
                <Link to='/schwimmen' className='btn'><MenuButton btnName='Schwimmen' /></Link>
                <Link to='/capsa'><MenuButton btnName='Capsa' /></Link>
                <h3 className='p-3'>Created by: Patrick Susanto</h3>
            </div>
        </>
    );
}

export default Menu;