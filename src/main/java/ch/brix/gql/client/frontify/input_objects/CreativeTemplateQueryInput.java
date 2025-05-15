package ch.brix.gql.client.frontify.input_objects;

public class CreativeTemplateQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * Sort order of the `CreativeTemplate` query result set.
   */
  public CreativeTemplateQueryInput sortBy(ch.brix.gql.client.frontify.enums.CreativeTemplateQuerySort v) {
    values.put("sortBy", v);
    return this;
  }
}
