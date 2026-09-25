package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RemoveCatalog {
  /**
   * **BETA** The ID of the `Catalog` that was just removed.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
