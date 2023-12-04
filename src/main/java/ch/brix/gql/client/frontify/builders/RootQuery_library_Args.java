package ch.brix.gql.client.frontify.builders;

public class RootQuery_library_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Library` Id.
   * Default value: null
   */
  public RootQuery_library_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
