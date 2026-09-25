package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ClearCatalogRow {
  /**
   * **BETA** The `CatalogRow` that was just cleared.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
}
