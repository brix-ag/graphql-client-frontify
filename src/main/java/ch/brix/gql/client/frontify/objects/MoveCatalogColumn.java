package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MoveCatalogColumn {
  /**
   * **BETA** The `CatalogColumn` that was just moved.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn column;
}
