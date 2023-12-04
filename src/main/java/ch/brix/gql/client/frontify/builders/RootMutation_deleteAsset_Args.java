package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteAsset_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `DeleteAsset` input argument.
   * Default value: null
   */
  public RootMutation_deleteAsset_Args input(ch.brix.gql.client.frontify.input_objects.DeleteAssetInput value) {
    _add_arg("input", value);
    return this;
  }
}
