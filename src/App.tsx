// @ts-ignore
import React, { useEffect, useState } from 'react';
import './styles.css';


interface Druzyna {
    id: number;
    nazwa: string;
}

export const ListaDruzyn: React.FC<{ druzyny: Druzyna[] }> = ({ druzyny }) => (
    <div className="container">
        <h2>Lista Drużyn:</h2>
        <ul>
            {druzyny.map((druzyna) => (
                <li key={druzyna.id} className="team-item">{druzyna.nazwa}</li>
            ))}
        </ul>
    </div>
);

const App: React.FC = () => {
    const [druzyny, setDruzyny] = useState<Druzyna[]>([]);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await fetch('/api/teams/getTeams'); // Poprawiony endpoint
                const data = await response.json();
                setDruzyny(data);
            } catch (error) {
                console.error('Błąd pobierania drużyn:', error);
                console.error('Błąd pobierania drużyn:', error);
            }
        };

        fetchData();
    }, []);

    return (
        <div className='container'>
            <h1>Aplikacja do Zarządzania Drużynami</h1>
            <ListaDruzyn druzyny={druzyny} />
        </div>
    );
};

export default App;
