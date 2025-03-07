package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertySelectValueTypeDependencyTypeOneOf implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyDependency {
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
   * `CustomMetadataPropertyOption` property option ids.
   */
  @com.google.gson.annotations.SerializedName("propertyOptionIds")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.IdScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> propertyOptionIds;
}
