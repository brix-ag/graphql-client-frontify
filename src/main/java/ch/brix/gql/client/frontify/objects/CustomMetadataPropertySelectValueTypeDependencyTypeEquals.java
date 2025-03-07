package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertySelectValueTypeDependencyTypeEquals implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyDependency {
  /**
   * `CustomMetadataPropertyDependency` type.
   */
  @com.google.gson.annotations.SerializedName("type")
  private ch.brix.gql.client.frontify.scalars.StringScalar type;
  /**
   * The dependee `CustomMetadataProperty` Id.
   */
  @com.google.gson.annotations.SerializedName("propertyId")
  private ch.brix.gql.client.frontify.scalars.IdScalar propertyId;
  /**
   * `CustomMetadataPropertyOption` Id.
   */
  @com.google.gson.annotations.SerializedName("propertyOptionId")
  private ch.brix.gql.client.frontify.scalars.IdScalar propertyOptionId;
}
