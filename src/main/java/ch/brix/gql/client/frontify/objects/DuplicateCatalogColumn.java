package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DuplicateCatalogColumn {
  /**
   * **BETA** The `CatalogColumn` that was just duplicated.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn column;
}
