package model;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Dataset
{
    public static CategoryDataset createDatasetAddSR()
    {
        DefaultCategoryDataset dataset;

        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_al_sr_10 = 509510;
        int data_al_sr_100 = 11791;
        int data_al_sr_1000 = 4232;
        int data_al_sr_10000 = 2764;
        int data_al_sr_100000 = 2033;

        int data_hm_sr_10 = 5430;
        int data_hm_sr_100 = 3643;
        int data_hm_sr_1000 = 3328;
        int data_hm_sr_10000 = 3214;
        int data_hm_sr_100000 = 2952;

        // row keys...
        final String series_arraylist_sr = "ArrayList";
        final String series_hashmap_sr = "HashMap";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_al_sr_10, series_arraylist_sr, categorie_10);
        dataset.addValue(data_al_sr_100, series_arraylist_sr, categorie_100);
        dataset.addValue(data_al_sr_1000, series_arraylist_sr, categorie_1000);
        dataset.addValue(data_al_sr_10000, series_arraylist_sr, categorie_10000);
        dataset.addValue(data_al_sr_100000, series_arraylist_sr, categorie_100000);

        dataset.addValue(data_hm_sr_10, series_hashmap_sr, categorie_10);
        dataset.addValue(data_hm_sr_100, series_hashmap_sr, categorie_100);
        dataset.addValue(data_hm_sr_1000, series_hashmap_sr, categorie_1000);
        dataset.addValue(data_hm_sr_10000, series_hashmap_sr, categorie_10000);
        dataset.addValue(data_hm_sr_100000, series_hashmap_sr, categorie_100000);

        return dataset;
    }
    public static CategoryDataset createDatasetAddOB()
    {
        DefaultCategoryDataset dataset;

        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_al_ob_10 = 5095100;
        int data_al_ob_100 = 1179100;
        int data_al_ob_1000 = 4231900;
        int data_al_ob_10000 = 27644600;
        int data_al_ob_100000 = 203313700;

        int data_hm_ob_10 = 54300;
        int data_hm_ob_100 = 364300;
        int data_hm_ob_1000 = 3327700;
        int data_hm_ob_10000 = 32136800;
        int data_hm_ob_100000 = 295151000;

        // row keys...
        final String series_arraylist_ob = "ArrayList";
        final String series_hashmap_ob = "HashMap";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_al_ob_10, series_arraylist_ob, categorie_10);
        dataset.addValue(data_al_ob_100, series_arraylist_ob, categorie_100);
        dataset.addValue(data_al_ob_1000, series_arraylist_ob, categorie_1000);
        dataset.addValue(data_al_ob_10000, series_arraylist_ob, categorie_10000);
        dataset.addValue(data_al_ob_100000, series_arraylist_ob, categorie_100000);

        dataset.addValue(data_hm_ob_10, series_hashmap_ob, categorie_10);
        dataset.addValue(data_hm_ob_100, series_hashmap_ob, categorie_100);
        dataset.addValue(data_hm_ob_1000, series_hashmap_ob, categorie_1000);
        dataset.addValue(data_hm_ob_10000, series_hashmap_ob, categorie_10000);
        dataset.addValue(data_hm_ob_100000, series_hashmap_ob, categorie_100000);

        return dataset;
    }
    public static CategoryDataset createDatasetRemoveSR()
    {
        DefaultCategoryDataset dataset;

        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_al_sr_10 = 6600;
        int data_al_sr_100 = 4750;
        int data_al_sr_1000 = 4552;
        int data_al_sr_10000 = 3225;
        int data_al_sr_100000 = 10975;

        int data_hm_sr_10 = 13300;
        int data_hm_sr_100 = 3260;
        int data_hm_sr_1000 = 2733;
        int data_hm_sr_10000 = 1948;
        int data_hm_sr_100000 = 1500;

        // row keys...
        final String series_arraylist_sr = "ArrayList";
        final String series_hashmap_sr = "HashMap";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_al_sr_10, series_arraylist_sr, categorie_10);
        dataset.addValue(data_al_sr_100, series_arraylist_sr, categorie_100);
        dataset.addValue(data_al_sr_1000, series_arraylist_sr, categorie_1000);
        dataset.addValue(data_al_sr_10000, series_arraylist_sr, categorie_10000);
        dataset.addValue(data_al_sr_100000, series_arraylist_sr, categorie_100000);

        dataset.addValue(data_hm_sr_10, series_hashmap_sr, categorie_10);
        dataset.addValue(data_hm_sr_100, series_hashmap_sr, categorie_100);
        dataset.addValue(data_hm_sr_1000, series_hashmap_sr, categorie_1000);
        dataset.addValue(data_hm_sr_10000, series_hashmap_sr, categorie_10000);
        dataset.addValue(data_hm_sr_100000, series_hashmap_sr, categorie_100000);

        return dataset;
    }
    public static CategoryDataset createDatasetRemoveOB()
    {
        DefaultCategoryDataset dataset;

        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_al_ob_10 = 6600;
        int data_al_ob_100 = 47500;
        int data_al_ob_1000 = 455200;
        int data_al_ob_10000 = 3224600;
        int data_al_ob_100000 = 109754700;

        int data_hm_ob_10 = 13300;
        int data_hm_ob_100 = 32600;
        int data_hm_ob_1000 = 273300;
        int data_hm_ob_10000 = 1947500;
        int data_hm_ob_100000 = 14999800;

        // row keys...
        final String series_arraylist_ob = "ArrayList";
        final String series_hashmap_ob = "HashMap";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_al_ob_10, series_arraylist_ob, categorie_10);
        dataset.addValue(data_al_ob_100, series_arraylist_ob, categorie_100);
        dataset.addValue(data_al_ob_1000, series_arraylist_ob, categorie_1000);
        dataset.addValue(data_al_ob_10000, series_arraylist_ob, categorie_10000);
        dataset.addValue(data_al_ob_100000, series_arraylist_ob, categorie_100000);

        dataset.addValue(data_hm_ob_10, series_hashmap_ob, categorie_10);
        dataset.addValue(data_hm_ob_100, series_hashmap_ob, categorie_100);
        dataset.addValue(data_hm_ob_1000, series_hashmap_ob, categorie_1000);
        dataset.addValue(data_hm_ob_10000, series_hashmap_ob, categorie_10000);
        dataset.addValue(data_hm_ob_100000, series_hashmap_ob, categorie_100000);

        return dataset;
    }
}
