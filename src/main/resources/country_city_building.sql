use XF;

create view Country_City as
	select co.CountryID as Country_CountryID,
			 co.Name as Country_Name,
			 ci.CityID as City_CityID,
			 ci.Name as City_Name,
			 ci.Population as City_Population,
			 ci.CountryID as City_CountryID
	from Country co left outer join City ci on
		co.CountryID = ci.CountryID;


create view Country_City_Building as
	select cc.Country_CountryID,
		 cc.Country_Name,
		 cc.City_CityID,
		 cc.City_Name,
		 cc.City_Population,
		 cc.City_CountryID,
		 b.BuildingID as Building_BuildingID,
		 b.Name as Building_Name,
		 b.Floors as Building_Floors,
		 b.CityID as Building_CityID
	from Country_City cc left outer join Building b on
		b.cityID = cc.City_CityID;


-- 1.
select Country_CountryID, Country_Name from Country_City
	group by Country_CountryID
	having sum(City_Population) > 400;

-- 2.
select Country_Name from Country_City_Building
	group by Country_Name
	having count(Building_BuildingID) = 0;