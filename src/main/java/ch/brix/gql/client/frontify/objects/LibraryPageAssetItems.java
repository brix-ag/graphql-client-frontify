package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class LibraryPageAssetItems {
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
   * List of type `Asset`.
   */
  @com.google.gson.annotations.SerializedName("items")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.Asset.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.Asset> items;
}
