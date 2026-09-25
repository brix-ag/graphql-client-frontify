package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateCatalogRow {
  /**
   * **BETA** The `CatalogRow` that was just created.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
}
