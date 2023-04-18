import * as React from 'react';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import Grid from "@mui/material/Grid";
import { toast } from "react-hot-toast";
import { addProductToCart, createCart } from "../api/CartService";
import {CardMedia} from "@mui/material";

export const Products = ({ products }) => {
    const addProduct = (productId) => {
        if (localStorage.getItem('cartId') == null) {
            createCart().then((res => {
                localStorage.setItem("cartId", res);
            }))
        }
        const cartId = localStorage.getItem('cartId');
        console.log(cartId);
        addProductToCart(cartId, productId).then((res) => console.log("eklendi"));
    };

    return (
        <Grid container spacing={2}>
            {products?.map((product, index) => {
                return (
                    <Grid item key={index}>
                        <Card sx={{ width: 500, height: 700 }} variant="outlined">
                            <CardContent>
                                <CardMedia
                                    component="img"
                                    height="400"
                                    image={product.imageUrl}
                                />
                                <br />
                                <Typography variant="h5" component="div">
                                    {product.productName}
                                </Typography>
                                <Typography sx={{ mb: 1.5 }} color="text.secondary"></Typography>
                                <Typography variant="body2">{product.salesPrice} TL</Typography>
                            </CardContent>
                            <CardActions sx={{ justifyContent: "center", marginBottom: 1 }}>
                                <Button
                                    onClick={() => {
                                        addProduct(product.productId);
                                        toast.success("Product successfully added to Cart");
                                    }}
                                    size="small"
                                    variant="contained"
                                    sx={{ justifyContent: "center", background: "rgba(153,128,162,0.57)" }}
                                >
                                    Add to Cart
                                </Button>
                            </CardActions>
                        </Card>
                    </Grid>
                );
            })}
        </Grid>
    );
};
