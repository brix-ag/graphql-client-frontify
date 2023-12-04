package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeAssetTags_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `RemoveAssetTags` input argument.
   * Default value: null
   */
  public RootMutation_removeAssetTags_Args input(ch.brix.gql.client.frontify.input_objects.RemoveAssetTagsInput value) {
    _add_arg("input", value);
    return this;
  }
}
