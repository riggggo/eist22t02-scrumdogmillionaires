import React from "react";
import { useParams } from "react-router-dom";
import Footer from "../components/Footer";
import NavigationBar from "../components/NavigationBar";
import SearchResultComp from "../components/SearchResultComp";
import { Grid } from "@mui/material";
import restaurant_data from "../data/restaurant_name_list.json";
export default function Search() {
  //hook from react router dom
  const { query } = useParams();

  return (
    <div>
      <NavigationBar />
      <div className="search-wrapper">
        <h1 className="title">
          Search results for <em>"{query}"</em>
        </h1>
      </div>
      <div className="search-result-wrapper">
        <Grid
          container
          alignItems="center"
          rowSpacing={{ xs: 3, md: 4 }}
          columnSpacing={{ xs: 3, md: 4 }}
        >
          {
            // value: how many of the 12 available columns are occupied by the component
          }
          {restaurant_data["restaurants"].map((restaurant) => {
            return (
              <Grid item xs={12} sm={6} md={4} lg={3}>
                <SearchResultComp restaurant={restaurant}></SearchResultComp>
              </Grid>
            );
          })}
        </Grid>
      </div>

      <Footer />
    </div>
  );
}
