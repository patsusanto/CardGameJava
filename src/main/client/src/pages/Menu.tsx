import React from 'react';
import MenuButton from '../components/MenuButton';
import { Link } from 'react-router-dom';

function Menu() {
    return (
        <>
            <div className="flex flex-col">
                <h1 className="p-5">Card Games</h1>
            </div>
            <div className="flex flex-col">
                <Link to='/schwimmen'><MenuButton btnName='Schwimmen' /></Link>
                <MenuButton btnName='Capsa' />
                <Link to='/capsa'><h3 className='p-3'>Created by: Patrick Susanto</h3></Link>
            </div>
        </>
    );
}

export default Menu;