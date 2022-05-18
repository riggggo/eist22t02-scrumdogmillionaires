package hello.world.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("sayHello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("error")
    public String sayError() {
        return "                                 An error happened                               \n" +
                "                                                                                \n" +
                "                                       ...                                      \n" +
                "                               .....         ....                               \n" +
                "                            ..                    ...                           \n" +
                "                         ...                         ..                         \n" +
                "                    .........                          ..                       \n" +
                "                ...                                    .....                    \n" +
                "              ..                                      ..    ...                 \n" +
                "             ..                                               ...               \n" +
                "             ..                                                 .               \n" +
                "             ..                                                 .               \n" +
                "              ...                                              ..               \n" +
                "                ..................             .................                \n" +
                "                  .                                          ..                 \n" +
                "                 ..                                          ..                 \n" +
                "                 (.............................................,                \n" +
                "                 ##%%%%%#(((((((#(.(#(#(%%%%##(##(#(##((%%%%%%#*                \n" +
                "                 ((%((........../,.............%.........#(#%#(                 \n" +
                "                 (###*......%%(................../%%*......####/                \n" +
                "                ##*#(,....#..........................*(....###,#                \n" +
                "                 ((##......&@@  .%............#@@@  @,.....#(/##                \n" +
                "                   .#,.....@@@@@@@............&@@@@@@#.....#(                   \n" +
                "                    #/......(&@&(...............#@&(......,#.                   \n" +
                "                    ##....................................#(                    \n" +
                "                    ##................####/,(#(/..........##                    \n" +
                "                     (#...........(((,.........((........(#                     \n" +
                "                     .#(........(#.......................#/                     \n" +
                "                       (#..............................(#,                      \n" +
                "                   *... /((........................./((*  ...                   \n" +
                "                 ...       .#(((#*...........*#(((#(.        ..                 \n" +
                "                 ..          ..###(###########/##.,           ..                \n" +
                "              .....            ....###########...             ..,..             \n" +
                "            ..   .                   ........                 ..   ..           \n" +
                "          ..     .                ...                         ..     ..         \n" +
                "        ..       ..              ..                           ..       ..       \n" +
                "      ..        ...              ..                           ...       ...     \n" +
                "     ..       .. ..              ..   %%%                     .. ..       ..    \n" +
                "    ..      ..   ..              ..                           ..   ..      ..   \n" +
                "   ..      ..    ..              ..                           ..    ..      ..  \n" +
                "  ..      ..     ..              ..                           ..     ..      .. \n" +
                "  ..     ..      ..              ..   %%%                     ..      .      .. \n" +
                " ..      ..      ..              ..                           ..      ..      ..\n" +
                " ..      .       ..              ..                           ..      ..      ..\n" +
                " ..     ..       ..              ..                           ..       .      ..\n" +
                " ..      .       ..              ..    .                      ..       .      ..\n" +
                " ..      ..      ..              ..   %%%                     ..      ..      ..\n" +
                " ..      ..      ..              ..                           ..      ..      ..\n" +
                " ##(#(*...#((    ..              ..                           ..    ##(...*#((#(\n" +
                " /*.........(#   ..              ..                           ..   ##.........#(\n" +
                "((...........(#  ..              ..   %%%                     ..  ((...........(\n" +
                " (/.......#####  ..              ..                           ..  (###(.......#(\n" +
                " ,(#......##     ..              ..                           ..     ##......(# \n" +
                "    (##((#       ..              ..                           ..       (#####   \n" +
                "                       %%#######%%            %%#######%/                       \n" +
                "                       %%#######%.            %%#######%#                       \n" +
                "                       %%######%%             %%#######%#                       \n" +
                "                       %%######%%             %%#######%%                       \n" +
                "                       %%######%%             ,%#######%%                       \n" +
                "                       %#######%(              %%######%%                       \n" +
                "                       %######%%               %%######%%                       \n" +
                "                .     .%######%%               %%######%%     .                 \n" +
                "           &&&@@@@@@&&&@@@@@@@&&               &&@@@@@@@&&&@@@@@@&&&            \n" +
                "         &&@@@@@@@@@@@@@@@@@@@@&,              &&@@@@@@@@@@@@@@@@@@@&&          \n" +
                "       ,&&@@@@@@@@@@@@@@@@@@@@&&               &&@@@@@@@@@@@@@@@@@@@@@&&        \n";
    }

    @GetMapping("sayByby")
    public String sayByBy() {
        return "Tschüss World!";
    }

    @GetMapping("sayJson")
    public int[] sayJ() {
        return new int[]{1,3,4};
    }

}
