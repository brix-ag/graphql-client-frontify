package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogWindow {
  /**
   * **BETA** The independently paginated columns represented by this window.
   */
  @com.google.gson.annotations.SerializedName("columns")
  private ch.brix.gql.client.frontify.objects.CatalogColumnItems columns;
  /**
   * **BETA** The independently paginated rows and their cells represented by this window.
   */
  @com.google.gson.annotations.SerializedName("rows")
  private ch.brix.gql.client.frontify.objects.CatalogWindowRowItems rows;
}
