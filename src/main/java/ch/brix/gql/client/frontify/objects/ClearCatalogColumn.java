package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ClearCatalogColumn {
  /**
   * **BETA** The `CatalogColumn` that was just cleared.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn column;
}
