package ch.brix.gql.client.frontify.builders;

public class Brand_projects_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Project` types.
   * Default value: null
   */
  public Brand_projects_Args types(java.util.List<ch.brix.gql.client.frontify.enums.ProjectType> value) {
    _add_arg("types", value);
    return this;
  }
}
