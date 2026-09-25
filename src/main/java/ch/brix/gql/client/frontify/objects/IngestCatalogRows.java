package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class IngestCatalogRows {
  /**
   * **BETA** Number of new `CatalogRow` created.
   */
  @com.google.gson.annotations.SerializedName("created")
  private ch.brix.gql.client.frontify.scalars.IntScalar created;
  /**
   * **BETA** Number of existing `CatalogRow` updated.
   */
  @com.google.gson.annotations.SerializedName("updated")
  private ch.brix.gql.client.frontify.scalars.IntScalar updated;
  /**
   * **BETA** Number of `CatalogRow` skipped (null primary key values).
   */
  @com.google.gson.annotations.SerializedName("skipped")
  private ch.brix.gql.client.frontify.scalars.IntScalar skipped;
}
