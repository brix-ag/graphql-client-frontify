package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateCatalogColumn {
  /**
   * **BETA** The `CatalogColumn` that was just updated.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn column;
}
