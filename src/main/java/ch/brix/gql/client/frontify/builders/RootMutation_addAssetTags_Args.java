package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetTags_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `AddAssetTags` input argument.
   * Default value: null
   */
  public RootMutation_addAssetTags_Args input(ch.brix.gql.client.frontify.input_objects.AddAssetTagsInput value) {
    _add_arg("input", value);
    return this;
  }
}
