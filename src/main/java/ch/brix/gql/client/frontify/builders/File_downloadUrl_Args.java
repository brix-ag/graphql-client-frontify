package ch.brix.gql.client.frontify.builders;

public class File_downloadUrl_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * Download `Url` validity in days. Defaults to `1` when both `validityInDays` and `permanent` arguments are not specified.
   * Default value: null
   */
  public File_downloadUrl_Args validityInDays(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("validityInDays", value);
    return this;
  }
  /**
   * Download `Url` validity state. When `true`, `Url` will be indefinitely valid, unless explicitly stated otherwise in the `validityInDays` argument.
   * Default value: null
   */
  public File_downloadUrl_Args permanent(ch.brix.gql.client.frontify.scalars.BooleanScalar value) {
    _add_arg("permanent", value);
    return this;
  }
}
