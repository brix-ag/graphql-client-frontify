package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyOption {
  /**
   * `CustomMetadataPropertyOption` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `CustomMetadataPropertyOption` value.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
  /**
   * Indicates if a `CustomMetadataPropertyOption` value is set to newly updated `Assets` by default.
   */
  @com.google.gson.annotations.SerializedName("isDefault")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isDefault;
}
