package ch.brix.gql.client.frontify.input_objects;

public class CustomMetadataPropertyDependencyPropertyInput extends ch.brix.gql.client.InputObject {
  /**
   * The dependee `CustomMetadataProperty` Id.
   */
  public CustomMetadataPropertyDependencyPropertyInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `CustomMetadataPropertyOption` Id for the dependency type `SELECT_EQUALS`.
   */
  public CustomMetadataPropertyDependencyPropertyInput optionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("optionId", v);
    return this;
  }
  /**
   * `CustomMetadataPropertyOption` Ids for the dependency type `SELECT_ONE_OF`.
   */
  public CustomMetadataPropertyDependencyPropertyInput optionIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("optionIds", v);
    return this;
  }
}
