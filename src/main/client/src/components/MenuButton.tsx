import React from 'react';

type Props = {
    btnName: string;
};

function MenuButton({ btnName } : Props) {
    return (
        <button className="p-2 m-3" >{btnName}</button>
    );
}

export default MenuButton;
