package ch.brix.gql.client.frontify.builders;

public class RootMutation_syncAssetTags_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `SyncAssetTags` input argument.
   * Default value: null
   */
  public RootMutation_syncAssetTags_Args input(ch.brix.gql.client.frontify.input_objects.SyncAssetTagsInput value) {
    _add_arg("input", value);
    return this;
  }
}
