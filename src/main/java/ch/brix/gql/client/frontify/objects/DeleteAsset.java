package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteAsset {
  /**
   * The Id of the deleted `Asset`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **DEPRECATED** `Asset` details. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("asset")
  private ch.brix.gql.client.frontify.interfaces.Asset asset;
}
