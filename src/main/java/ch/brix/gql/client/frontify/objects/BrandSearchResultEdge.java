package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class BrandSearchResultEdge {
  /**
   * `BrandSearchResult` title.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * `BrandSearchResult` node.
   */
  @com.google.gson.annotations.SerializedName("node")
  private ch.brix.gql.client.frontify.unions.BrandSearchResult node;
}
