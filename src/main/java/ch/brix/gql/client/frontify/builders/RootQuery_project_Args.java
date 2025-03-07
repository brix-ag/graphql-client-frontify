package ch.brix.gql.client.frontify.builders;

public class RootQuery_project_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Project` Id.
   * Default value: null
   */
  public RootQuery_project_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
