import { Box, Typography, Button, Stack } from '@mui/material';
import { styled } from '@mui/system';
import {CategoryList} from "../components/CategoryList";

// Splash Screen için ana bileşen
const SplashScreen = styled(Box)(({ theme }) => ({
    height: '100vh',
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: '#9473a5',
}));

const Logo = styled('img')(({ theme }) => ({
    width: '200px',
    marginBottom: '32px',
}));

const SplashMessage = styled(Typography)(({ theme }) => ({
    color: 'white',
    textAlign: 'center',
    marginBottom: '32px',
}));

export const HomeScreen = () => {
    return (
        <SplashScreen>
            <Logo src="https://1stwebdesigner.com/wp-content/uploads/2017/12/colorful-logo-design-03.jpg" alt="BÜŞRA HOME" />
            <SplashMessage variant="h4">
                Hoşgeldiniz, aradığınız her şey burada!
            </SplashMessage>
            <CategoryList />
        </SplashScreen>

    );
}





