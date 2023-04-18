import * as React from 'react';
import Box from '@mui/material/Box';
import Drawer from '@mui/material/Drawer';
import CssBaseline from '@mui/material/CssBaseline';
import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import List from '@mui/material/List';
import Typography from '@mui/material/Typography';
import Divider from '@mui/material/Divider';
import ListItem from '@mui/material/ListItem';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import IconButton from "@mui/material/IconButton";
import AddShoppingCartIcon from "@mui/icons-material/AddShoppingCart";
import {useEffect, useState} from "react";
import {useLocation, useNavigate} from "react-router-dom";
import SellIcon from '@mui/icons-material/Sell';
import {getCategories} from "../api/CategoryService";
import {getCartProducts} from "../api/CartService";
import {Products} from "./Products";
import {getProducts} from "../api/ProductsService";
import {Checkout} from "./Checkout";



const drawerWidth = 240;

export const CategoryList = () => {

    const navigate = useNavigate()
    const location = useLocation()
    const [categories, setCategories] = useState([])
    const [selectedCategoryId, setSelectedCategoryId] = useState(0)
    const [products, setProducts] = useState([]);
    const [cartProducts, setCartProducts] = useState([]);
    const [imageSrc, setImageSrc] = useState('');




    useEffect(() => {
        getCategories().then((res) =>
        {
            setCategories(res)
        });
    },[])

    useEffect(() => {

        getProducts(selectedCategoryId).then((res) => {

            setProducts(res)
        })
    },[selectedCategoryId]);

    useEffect(() => {
        const cartId = localStorage.getItem('cartId');
        if(cartId){

            getCartProducts(cartId).then((res) => {

                setCartProducts(res)
            })
        }
    },[localStorage.getItem('cartId')])


    return (
        <Box sx={{ display: 'flex', background: 'rgba(228,182,232,0.63)' }}>
            <CssBaseline />
            <AppBar
                position="fixed"
                sx={{ flexGrow: 1, background: 'rgba(111,27,121,0.63)' }}
            >
                <Toolbar>
                    <Typography
                        variant="h6"
                        noWrap
                        component="div"
                        sx={{ display: { xs: 'none', sm: 'block' } }}
                    >
                        BÜŞRA HOME
                    </Typography>
                    <Box sx={{ flexGrow: 1, background: 'rgba(196,157,204,0.63)' }} />
                    <Box sx={{ display: { xs: 'none', md: 'flex' } }}>
                        <IconButton onClick={() => navigate('/checkout')} size="large" color="inherit">
                            <AddShoppingCartIcon/>
                        </IconButton>
                    </Box>
                </Toolbar>
            </AppBar>
            <Drawer
                sx={{
                    width: drawerWidth,
                    flexShrink: 0,
                    '& .MuiDrawer-paper': {
                        width: drawerWidth,
                        boxSizing: 'border-box',
                        background: 'rgba(111,27,121,0.16)',
                    },
                }}
                variant="permanent"
                anchor="left"
            >
                <Toolbar />
                <Divider />
                <List>
                    {categories.map((category, id) => (
                        <ListItem onClick={() => setSelectedCategoryId(category.categoryId)} key={category.categoryName} disablePadding>
                            <ListItemButton onClick={() => navigate('/')} component="a" >
                                <ListItemIcon sx={{ fontSize: 20 }}><SellIcon/></ListItemIcon>
                                <ListItemText primary={category.categoryName} />
                            </ListItemButton>
                        </ListItem>
                    ))}
                </List>
            </Drawer>
            <Box
                component="main"
                sx={{ flexGrow: 1, p: 3 }}
            >
                <Toolbar />
                {
                    location.pathname === '/' ? <Products products={products}

                    /> : <Checkout cartProducts={cartProducts}

                    />
                }
            </Box>
        </Box>
    );
}
