package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteCollection_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `DeleteCollection` input argument.
   * Default value: null
   */
  public RootMutation_deleteCollection_Args input(ch.brix.gql.client.frontify.input_objects.DeleteCollectionInput value) {
    _add_arg("input", value);
    return this;
  }
}
