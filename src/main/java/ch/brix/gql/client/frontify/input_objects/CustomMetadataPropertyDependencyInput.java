package ch.brix.gql.client.frontify.input_objects;

public class CustomMetadataPropertyDependencyInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataPropertyDependency` type.
   */
  public CustomMetadataPropertyDependencyInput type(ch.brix.gql.client.frontify.enums.CustomMetadataPropertyDependencyType v) {
    values.put("type", v);
    return this;
  }
  /**
   * **BETA** Dependee property details.
   */
  public CustomMetadataPropertyDependencyInput property(ch.brix.gql.client.frontify.input_objects.CustomMetadataPropertyDependencyPropertyInput v) {
    values.put("property", v);
    return this;
  }
}
