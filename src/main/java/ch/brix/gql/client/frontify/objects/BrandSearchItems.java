package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandSearchItems {
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
  /**
   * List of `BrandSearchResult` items.
   */
  @com.google.gson.annotations.SerializedName("items")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.unions.BrandSearchResult.class)
  private java.util.List<ch.brix.gql.client.frontify.unions.BrandSearchResult> items;
  /**
   * List of `BrandSearchResult` edges.
   */
  @com.google.gson.annotations.SerializedName("edges")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.BrandSearchResultEdge.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.BrandSearchResultEdge> edges;
}
