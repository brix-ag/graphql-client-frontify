package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteLicense {
  /**
   * The Id of the deleted `License`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **DEPRECATED** `License` details. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("license")
  private ch.brix.gql.client.frontify.objects.License license;
}
