package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateCatalogColumn {
  /**
   * **BETA** The `CatalogColumn` that was just created.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn column;
}
