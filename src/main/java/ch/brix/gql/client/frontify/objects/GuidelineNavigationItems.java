package ch.brix.gql.client.frontify.objects;

import ch.brix.gql.client.frontify.unions.UnionGuidelineShizzleNavigationItem;

@lombok.Data
public class GuidelineNavigationItems {
  /**
   * **BETA** The paginated list of `Guideline` navigation items.
   */
  @com.google.gson.annotations.SerializedName("items")
  @ch.brix.gql.client.InnerType(UnionGuidelineShizzleNavigationItem.class)
  private java.util.List<UnionGuidelineShizzleNavigationItem> items;
  /**
   * Total amount of results.
   */
  @com.google.gson.annotations.SerializedName("total")
  private ch.brix.gql.client.frontify.scalars.IntScalar total;
  /**
   * Current page number.
   */
  @com.google.gson.annotations.SerializedName("page")
  private ch.brix.gql.client.frontify.scalars.IntScalar page;
  /**
   * Number of results per page.
   */
  @com.google.gson.annotations.SerializedName("limit")
  private ch.brix.gql.client.frontify.scalars.IntScalar limit;
  /**
   * Indicates if a next page is available or not
   */
  @com.google.gson.annotations.SerializedName("hasNextPage")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar hasNextPage;
}
