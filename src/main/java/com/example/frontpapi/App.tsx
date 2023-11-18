``// App.tsx
// @ts-ignore
import React, { useEffect, useState } from 'react';

interface Druzyna {
    id: number;
    nazwa: string;
}

export const ListaDruzyn: React.FC<{ druzyny: Druzyna[] }> = ({ druzyny }) => (
    <div>
        <h2>Lista Drużyn:</h2>
        <ul>
            {druzyny.map((druzyna) => (
                <li key={druzyna.id}>{druzyna.nazwa}</li>
            ))}
        </ul>
    </div>
);

useEffect(() => {
    const fetchData = async () => {
        try {
            const response = await fetch('/api/teams/getTeams'); // Poprawiony endpoint
            const data = await response.json();
            setDruzyny(data);
        } catch (error) {
            console.error('Błąd pobierania drużyn:', error);
        }
    };

    fetchData();
}, []);
    return (
        <div>
            <h1>Aplikacja do Zarządzania Drużynami</h1>
            <ListaDruzyn druzyny={druzyny} />
        </div>
    );


export default App;
